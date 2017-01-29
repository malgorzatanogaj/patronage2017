# language: pl

Funkcja:
  Jako użytkownik chciałbym móc sortować wyświetlone przedmioty tak aby móc znaleźć te które interesują mnię najbardziej

  Scenariusz:
  Sortowanie po cenie rosnąco

    Mając wyświetloną główną stronę sklepu
    Kiedy kliknę w link "DRESSES"
    I wybiorę z pola Sort by wartość "Price: Lowest first"
    Wtedy produkty bedą posortowane po cenie rosnąco

  Scenariusz:
  Sortowanie po cenie malejąco

    Mając wyświetloną główną stronę sklepu
    Kiedy kliknę w link "DRESSES"
    I wybiorę z pola Sort by wartość "Price: Highest first"
    Wtedy produkty bedą posortowane po cenie malejąco