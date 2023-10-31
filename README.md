# Java Core & SQL Native

---

(GitHub Link)["https://github.com/hamitmizrak/TechMasterFullStack5_LibrariesProject.git"]

<br/>
(GitLab Link)["https://"]

## Java Core 
*Java* with **sql**
>
> 
> 

- Roles
- Files
- Enum


```sh
Java Base Version: 21
libraries:
```

## for java  libraries
```sh
Mysql
H2DB
```

```sh
Login
Register 
Üye sisteme giri? yaparken öncelikle database ilgili kay?t var m? diye bak?yor. E?er bu kullan?c? yoksa register
sayfas?na yönlendiriyor.
Kullan?c?lar sisteme yanl?? giri? yapt?klar?nda log dosyas? olu?turuluyor. 
E?er Üye pasifse sisteme giri? yapamas?n bunu ancak admin aktifle?tirebilsin.
Dosya ekleme (writer ve admin)
Dosya silmeyi sadece admin yapabilsin.
3 tane rol bulunmaktad?r.
1-) admin 
2-) writer 
3-) user   
```

```sh
Projemiz Kütüphane otomasyonudur.
Sistemde ilgili email yoksa yeniden kay?t olu?tur.

specialHomePage: 
Roller:
Create
Delete
Update
F?ndByID
F?ndByEmail
MemberActivePassive
Roller Change 
Loglama 

-------
Admin: 
specialHomePage(+)
Roller(+)
Create(+)
Delete(+)
Update(+)
F?ndByID(+)
F?ndByEmail(+)
MemberActivePassive(+)
Admin,Writer,User kendi bilgileri CRUD (+)
Loglama (+)
-------
Writer:
specialHomePage(+)
Roller(-)
Create(-)
Delete(-)
Update(-)
F?ndByID(+)
F?ndByEmail(+)
MemberActivePassive(-)
Writer kendi bilgileri CRUD (+)
Loglama (+)
------ 
User: 
specialHomePage(+)
Roller(-)
Create(-)
Delete(-)
Update(-)
F?ndByID(-)
F?ndByEmail(-)
MemberActivePassive(-)
User kendi bilgileri CRUD (+)
Loglama (+)
```


## SQL 
```sh
select * from register;
```
