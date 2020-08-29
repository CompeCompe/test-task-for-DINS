Приложение запускается из файла dins.jar

 <h1> Создание БД </br></h1>
 </br>
Перед запуском необходимо создать БД в MySql Workbench (или любым другим, удобным для вас способом)</br>
Для удобства создадим новое MySql connection с такими параментрами </br>
![image](https://user-images.githubusercontent.com/62572691/91643564-0f5ed800-ea3d-11ea-8a88-8d6f88e1fa0b.png)</br>
Пароль должен совпадать с именем пользователя (root)</br>
Если на вашей локальной машине стоит другой пароль для root, то можете воcпользоваться командой</br>
SET PASSWORD = PASSWORD("root");</br>

Создадим новую схему и назовем ее "rest"</br>

![image](https://user-images.githubusercontent.com/62572691/91643667-f571c500-ea3d-11ea-823b-f74abc715729.png)</br>

Скопируйте код для создания таблицы </br>

use rest;</br>
CREATE TABLE IF NOT EXISTS users (</br>
	id BIGINT PRIMARY KEY AUTO_INCREMENT,</br>
    first_name varchar(50) NOT NULL,</br>
    last_name varchar(100) NOT NULL,</br>
    birthday DATE not null,</br>
    adress varchar(1000) not null</br>
);</br>
ALTER TABLE users CHANGE first_name first_name varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci;</br>
ALTER TABLE users CHANGE last_name last_name varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci;</br>
ALTER TABLE users CHANGE address address varchar(1000) CHARACTER SET utf8 COLLATE utf8_unicode_ci;</br>
 и нажмите на ![image](https://user-images.githubusercontent.com/62572691/91643689-281bbd80-ea3e-11ea-882a-7d0d9f95a153.png)</br>

<h1> Запуск приложения</h1> </br>
</br>
Подготовительный этап сделан.</br>

Осталось скачать приложение. И открыть файл dins.jar. </br>

После чего в вашем браузере должна открыться вкладка с адресом http://localhost:8080/users</br>

В ней можно создавать пользователей (create users)</br>

Редактивровать (edit) и удалять (delete)</br>


(Как выглядит страница http://localhost:8080/users с созданными пользователями)</br>
![image](https://user-images.githubusercontent.com/62572691/91643737-8f397200-ea3e-11ea-9cbf-21b2a399457c.png)
