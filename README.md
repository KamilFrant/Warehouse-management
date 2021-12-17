# Warehouse-management

Prosty system zarządzania magazynem. 

# Możliwości systemu 
* Wyświetlenie stanu magazynu (tabela `products`)
* Dodanie nowego produtku do magazynu 
* Wyświetlenie produtków do zamówienia (tabela `orders`)
* Dodanie produktów do listy zamówień.


# Baza danych - MySql
Cała konfiguracja i połaczenie z bazą danych jest w pliku `application.properties`.
Połączenie z bazą danych:
```
spring.datasource.url = jdbc:mysql://localhost:3306/managment
spring.datasource.username=
spring.datasource.password=
```
Aplikacja działa na schemacie `managment` oraz używa użytkownika `root` z hasłem `admin`
 
# Automatyczne uzupełnienie tabel
Aplikacja przy uruchomieniu wykorzystuje plik `data.sql` do wypełnienia dwóch tabel `orders` i `products`


# Instalacja oraz uruchomienie aplikacji

W terminalu należy wpisać `mvn clean install`, aplikacja działa na porcie `8080`, cały URL `localhost:8080`

# Logowanie

Domyślne dane do logowania - login: `kowalski`, hasło: `springboot`.
Login oraz hasło ustawione są w pliku `SpringConfig`. 
Aby zmienić dane, należy podać nowe dane w tym miejscu:
```
.withUser("kowalski")
.password(encoder.encode("springboot"))
```

# Użyte technologie
* Spring Boot
* Spring Security
* Spring Data JPA
* Spring Web
* Thymeleaf
* Maven
* MySql
* Bootstrap
* Lombok

