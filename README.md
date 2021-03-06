2 – (JavaEE) 
Desenvolver uma API para o serviço de um estacionamento (Web Services Restfull), 
onde o usuário informa a marca, modelo e placa. 
Depois é retornado pela API o valor a ser pago pelo cliente.

A tabela de preço e a seguinte: 
 - quando for marca FORD o valor é 10;
 - quando for GM e o modelo for BLAZER o valor é 20;
 - quando a placa contem B e termina com 99 o valor é 1;
 - demais marcas e modelos o valor é 5;

Obs. Nesse exercício: 
É obrigatório utilizar um servidor de aplicação javaEE 7 (Preferencialmente Wildfly 10.1).
É obrigatório utilizar EJB e JPA para fazer o sistema.
É obrigatório utilizar banco de dados MySQL, e desenvolver o script de banco de dados também.

A massa de dados não precisa ser todas as marcas e modelos somente 5 marcas com 6 modelos cada.

Toda interação com o sistema será feito por Web Services Restfull, ou seja, 
quanto a entrada dos dados e a saída utilizaram Web Services.


### Configure Wildfly
```
unzip  ~/Downloads/wildfly-10.1.0.Final.zip -d /home/user
chmod a+x /home/user/wildfly-10.1.0.Final/bin/*.sh
export JBOSS_HOME=/home/user/wildfly-10.1.0.Final
$JBOSS_HOME/bin/add-user.sh admin admin
```
=====

#### [Using EclipseLink](https://docs.jboss.org/author/display/WFLY8/JPA+Reference+Guide#JPAReferenceGuide-UsingEclipseLink)
Copy eclipseLink to modules:

```
cp ~/Downloads/eclipselink.jar /home/user/wildfly-10.1.0.Final/modules/system/layers/base/org/eclipse/persistence/main
```
===

#### Edit module.xml
Open /home/user/wildfly-10.1.0.Final/modules/system/layers/base/org/eclipse/persistence/main/module.xml
```
    <resources>
        <resource-root path="jipijapa-eclipselink-10.1.0.Final.jar"/>
        <resource-root path="eclipselink.jar">
            <filter>
                <exclude path="javax/**" />
            </filter>
        </resource-root>
    </resources>
```

#### Adding missing module dependency into modules/system/layers/base/org/eclipse/persistence/main/module.xml:

```
<module name="javax.ws.rs.api"/>
```
===

#### Run JBoss
```
$JBOSS_HOME/bin/standalone.sh
```
====

####  Add datasource via jboss-cli
```
$JBOSS_HOME/bin/jboss-cli.sh -c "deploy ~/Downloads/hsqldb.jar,data-source add --driver-name=hsqldb.jar --use-ccm=false --jta=false --user-name=sa --name=DefaultDS --jndi-name=java:/DefaultDS --connection-url=jdbc:hsqldb:\$\{jboss.server.data.dir\}\$\{/\}hypersonic\$\{/\}localDB;shutdown=true;sql.syntax_mys=true;"
```
===

#### Run maven:
```
wildfly-clean-install
```
===


#### Test the app:
```
curl -i http://localhost:8080/api-estacionamento-rest/estacionamento/modelos
curl -i http://localhost:8080/api-estacionamento-rest/estacionamento/marcas
curl -i http://localhost:8080/api-estacionamento-rest/estacionamento/tickets


curl -i -H "Content-Type: application/json" -X POST -d '{"marca":"FORD","modelo":"RANGER","placa":"sxyz2017"}' http://localhost:8080/api-estacionamento-rest/estacionamentos/tickets
```
====


[Template Method in Java](https://sourcemaking.com/design_patterns/template_method/java/2)
