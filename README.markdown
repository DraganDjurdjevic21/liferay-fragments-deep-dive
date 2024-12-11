# Liferay Sample Workspace

The Liferay Sample workspace contains an example of every client extension and is meant to be the ***primary*** source of truth of how client extensions work by documenting via code.

Feel free to initiate your project by copying the samples found here. But make sure to rename your client extensions according to our established [naming conventions](#naming-conventions).

## Liferay with Docker

To run Liferay, go to `docker` and type `docker compose up -d`


## Client Extensions

Client extensions are the recommended way of customizing Liferay. Modules and themes are supported for backwards compatibility.

To deploy all client extensions, go to `liferay-fragments-deep-dive` and type `./gradlew dockerDeploy`.

To deploy a specific client extension (e.g. liferay-sample-custom-element-1), go to `liferay-fragments-deep-dive` and type `./gradlew :client-extensions:liferay-sample-frontend-token:dockerDeploy`.

### List of Client Extensions
- *liferay-sample-frontend-token*
  Extend a theme's CSS with CSS that uses a frontend-token-definition.json file.
- *liferay-sample-js-import-maps-entry*
  Share code via JavaScript import maps to a custom element.