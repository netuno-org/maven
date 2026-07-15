# Calc

This folder contains the project files for the tutorials on Java Core [Service](https://doc.netuno.org/docs/academy/server/java-core/web-service), [Resource](https://doc.netuno.org/docs/academy/server/java-core/resource) and [Event](https://doc.netuno.org/docs/academy/server/java-core/event).

The POM file here is just a sample, it probably won't work in your machine.

To generate you functional POM, use the script `generate-pom.js`.

Configure it so this four variables reflect your local settings:
```js
const NETUNO_DIR = '';
const PROJECT_DIR = '';
const PACKAGE = 'org.netuno.addon.calc';
const JAVA_VERSION = 25;
```

`PACKAGE` doesn't need to be changed, but you should set
`NETUNO_DIR` to be the full path of the folder where your Netuno instance is intalled and
`PROJECT_DIR` to be the full path where you will put this current folder (`Calc`).

Set also the `JAVA_VERSION` according to your Java version.

Then run the script with
```bash
bun generate-pom.js
# or
node generate-pom.js
# or
deno generate-pom.js
```

To read more about this, see this [link](https://doc.netuno.org/docs/academy/server/java-core/maven-setup). 
