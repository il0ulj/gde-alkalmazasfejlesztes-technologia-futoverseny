# GDE
## Alkalmazásfejlesztés technológia tantárgy
### futoverseny beadandó feladat leírása

# Alapvető entitások
- Futó: név, életkor, nem, és egyéni azonosító
- Verseny:  neve, távolsága (km), azonosító
- Eredmény: résztvevő, verseny, időeredmény perc

Az entitásokhoz vegyünk fel automatikusan tesztadatot a program futtatásakor a H2 adatbázisban (min. 4 futó, 2 verseny, 6 eredmény)

# Alapvető műveletek REST API-n keresztül
- /getRunners: összes futó alapadatai json struktúrában)
- /addRunner: futó felvétele post payloadban átadott adatok alapján
- /getRaceRunners/{ID}: adott azonosítójú verseny összes futójának neve és időeredménye emelkedő sorrendben)
- /updateRace: POST json payloadban átadott versenyazonsító nevének és távolságának update-je
- /addResult: Új eredmény rögzítése futók és versenyek számára
- /getAverageTime/{VERSENYID} Átlagos futási idő számítása egy adott versenyre

# Thymeleaf frontend
- Versenyek listázása
- Új verseny létrehozása (név, táv megadásával)
- Versenyek részletek oldala, amelyen a futók eredményei látszódnak (név, időeredmény)

# Technológiai és implementációs követelmények
- A backend Spring Boot keretrendszerrel készüljön, REST API-k formájában szolgáltatva a funkciókat. 
- Adattárolásra használjon H2 relációs adatbázist.
- Az adatok közötti kapcsolatok kezelésére használjon JPA-t (Java Persistence API).
- Az alkalmazás biztosítson alapvető hibakezelést és validációt az adatbevitel során.
- Az API-k teszteléséhez készíts Postman hívásokat, és ezek legyen berakva a projektstrukturába a test-ek közé.

# Értékelési szempontok
- A kód tisztasága, olvashatósága, és karbantarthatósága.
- A REST API-k megfelelő tervezése és implementálása.
- A funkcionális követelmények teljes körű megvalósítása.
- Az alkalmazás robusztussága és hibakezelése.
- Megfelelő commit-ok és commit message-ek

# Határidő
2024.05.22.

# Leadás
A projektet GitHub-on kell hostolni, és a repository URL-jét kell emailben elküldeni az oktató e-mail címére.

# Felhasznált segédanyagok
- https://start.spring.io/
- https://spring.io/projects/spring-boot
- https://www.postman.com/

# Felhasznált függőségek
- H2 Database
- Spring Data JPA
- Spring Web
- Thymeleaf