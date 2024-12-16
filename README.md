## Технологии и инструменты, которые я использую

<p align="center">
<img width="5%" title="IntelliJ IDEA" src="images/logo/IntelliJ_IDEA.png">
<img width="5%" title="Java" src="images/logo/Java_logo.png">
<img width="5%" title="Selenide" src="src/test/resources/images/logo/Selenide.png">
<img width="5%" title="Selenoid" src="images/logo/Selenoid.png">
<img width="5%" title="Allure Report" src="resources/images/logo/AllureReports.png">
<img width="5%" title="Gradle" src="resources/images/logo/Gradle.png">
<img width="5%" title="JUnit5" src="resources/images/logo/JUnit5.png">
<img width="5%" title="GitHub" src="resources/images/logo/GitHub.png">
<img width="5%" title="Jenkins" src="images/logo/Jenkins.png">
<img width="5%" title="Allure TestOps" src="resources/images/logo/AllureTestOps.svg">
<img width="5%" title="REST Assured" src="images/logo/RestAssured.png">
<img width="5%" title="Appium" src="images/logo/Appium.svg">
<img width="5%" title="Appium Inspector"="resources/images/logo/Inspector.png">
<img width="5%" title="Browserstack" ="resources/images/logo/Browserstack.svg">
<img width="5%" title="Telegram" src="resources/images/logo/Telegram.svg">
</p>

Пишу автотесты  на <code>Java</code> с использованием <code>JUnit 5</code> и <code>Gradle</code>, примененяя различные
библиотеки и фреймворки.

Использовал сборки в <code>Jenkins</code> с формированием Allure-отчета и отправкой уведомления с результатами
в <code>Telegram</code> после завершения прогона.
В качестве системы управления тестированием выбран <code>Allure TestOps</code>.

### Для UI-тестов 

* при написании использую фреймворк [Selenide](https://selenide.org/)
* запуск осуществляю локально или с помощью [Selenoid](https://aerokube.com/selenoid/).

### Для API-тестов

* использую библиотеку [REST Assured](https://rest-assured.io)
* для сокращения шаблонного кода  [Lombok](https://projectlombok.org/)
