## DB kurso užduotis

### Projektas - egzaminavimų progama.

#### Funkciniai reikalavimai
1. Programa turi galėti pateikti klausimus.
   1. Prieš pateikiant klausimus programa turi paklausti kas sprendžia egzaminą (paprastas
      vardo suvedimas yra užtektinai).
2. Kiekvienas klausimas turi turėti 3 atsakymo variantus.
3. Atsakymai turi būti priimami iš UI (User Interface) ir skaičiuojami prie bendro rezultato pagal
   nurodytas statistikas 6 punkte.
4. Programa turi turėti galimybę sukurti naujus klausimus ir atsaymų variantus kiekvienam
   klausimui.
   Nebūtina funkcija: kurti naujus klausimus turėtų būti galima tik suvedus
   administratoriaus slaptažodį.
5. Programa turi turėti galimybę redaguoti esamus klausimus
   Nebūtina funkcija: modifikuoti klausimus turėtų būti galima tik suvedus slaptažodį.
6. Turi būti galimybė pažiūrėti sekančias statistikas:
   1. Kiek kartų egzaminai buvo spręsti
   2. Teisingų atsakymų skaičius:
      1. viso
      2. kiekviename klausimyne
      3. vidurkis
   3. Kiek yra skirtingų atsakymo variantų pasirinkta (kiek buvo pasirinkta A, kiek B, kiek C)
7. Programa turi turėti galimybę būti išsijungti baigus darbą.

#### Techniniai reikalavimai:
1. Visa statistika turi būti išsaugota duomenų bazėje.
2. Panaudoti visas CRUD operacijas (Create, Read, Update and Delete).
3. Panaudoti ORM framework'ą.
4. Jei egzistuoja slaptažodis manipuliuoti klausimams - jį duomenų bazėje saugoti užšifruotą.
5. Programa turi panaudoti bent vieną native duomenų bazės funkciją ( SUM() , MAX() ar
   panašią).
6. Duomenų bazė turi turėti bent viena logišką indeksą.

#### Užduotys kartu su kursiniu darbu:
1. Paruošti duomenų bazės UML diagramą (SQL Power Architect).
2. Paruošti duomenų bazės inicializavimo užklausų rinkinį (SQL komandų failas ar keli failai).