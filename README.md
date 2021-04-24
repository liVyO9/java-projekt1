# java-projekt1
# PROJEKT 1 - PROJEKT STRUKTURY BANKU
-------------------------------------
GŁÓWNE ZASTOSOWANIA
--
Trzy klasy: Bank, Bankomat, Klienci -> Klient (indywidualny, tworzenie klienta), Klienci (lista klientów, modyfikacja, czy id klienta istnieje już)

Klienci:
- funkcje, tworzenie, modyfikacja
- imie, nazwisko, nr konta = id

Bankomat:
- zbiera nazwy klientów (?)
- obsługiwałby we/wy
- argument, kwota, wpłata/wypłata
- dostęp do klient
- bankomat do banku (informacja, chcę wypłacić x kwoty, jak nie ma x na koncie, to nie wypłaca) -> ewentualnie z poziomu klasy bank -> ZMIANA: Bankomat będzie zezwalał, ale to Bank będzie weryfikował, czy taka operacgja jest możliwa -> BANK
- może zebrać tablicę klientów - dziedziczenie z klasy klienci


Bank:
- dostęp bank do bankomatu
- stan konta -> do bankomatu
- przelewy między klientami - metoda przelew (nr konta, kwota, tytuł[opcjonalnie|imie, nazwisko]) - weryfikacja czy imię, nazwisko i nr konta się zgadza
- czy na pewno przelew zrobić (potwierdzenie, "Tak", lub "Nie")
- -> BANK -> Jeżeli zgadza się, to BANK robi print, czy operacja wykonana, czy nie

--------------------

TODO:
--
- obsługa wyjątków
------------------------
Notatki:
--
pola prywatne -> te w własnej klasie
