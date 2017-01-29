#language:pl

Funkcja:
  jako użytkownik chcę mieć możliwość kontaktu ze sklepem, aby móc zadawać pytania i zgłaszać uwagi

  Scenariusz:
  możliwość wejścia na stronę kontaktu ze sklepem przez kliknięcie w link "contakt us"

    Mając wyświetloną główną stronę sklepu
    Kiedy kliknę w link "Contact us"
    Wtedy zostanie wyświetlona strona o tytule "Contact us - My Store"
    I bedzie zawierała pola formularza kontaktu

  Scenariusz:
  Wyświetlanie podpowiedzi odnośnie wybranego tematu

    Mając wyświetloną główną stronę sklepu
    Kiedy kliknę w link "Contact us"
    Kiedy zostanie wyświetlona strona o tytule "Contact us - My Store"
    I z pola subject heading wybiorę opcję "Customer service"
    Wtedy Zostanie wyświetlona podpowiedź: For any question about a product, an order
    Kiedy z pola subject heading wybiorę opcję "Webmaster"
    Wtedy Zostanie wyświetlona podpowiedź: If a technical problem occurs on this website


  Szablon scenariusza:
  Wyświetlanie informacjo o błednie wypelnionych polach formularza
    Mając wyświetloną główną stronę sklepu
    Kiedy kliknę w link "Contact us"
    Kiedy zostanie wyświetlona strona o tytule "Contact us - My Store"
    Oraz z pola subject heading wybiorę opcję "<SubjectHeading>"
    Oraz W polu email wpiszę "<Email>"
    Oraz W polu message wpiszę "<Message>"
    I Klikne przycisk submit
    Wtedy Zostanie wyświetlona informacja o błędzie "<TekstBledu>"

    Przykłady:
      | SubjectHeading   | Email  | Message | TekstBledu                                      |
      | -- Choose --     |        |         | Invalid email address.                          |
      | -- Choose --     | a      |         | Invalid email address.                          |
      | -- Choose --     |        | a       | Invalid email address.                          |
      | -- Choose --     | a@a.pl |         | The message cannot be blank.                    |
      | -- Choose --     | a@a.pl | a       | Please select a subject from the list provided. |
      | Customer service |        |         | Invalid email address.                          |
      | Customer service | a      |         | Invalid email address.                          |
      | Customer service |        | a       | Invalid email address.                          |
      | Customer service | a@a.pl |         | The message cannot be blank.                    |
      | Webmaster        |        |         | Invalid email address.                          |
      | Webmaster        | a      |         | Invalid email address.                          |
      | Webmaster        |        | a       | Invalid email address.                          |
      | Webmaster        | a@a.pl |         | The message cannot be blank.                    |


  Szablon scenariusza:
  Wyświetlenie potwierdzenia poprawnie wysłąnego formularza

    Mając wyświetloną główną stronę sklepu
    Kiedy kliknę w link "Contact us"
    Kiedy zostanie wyświetlona strona o tytule "Contact us - My Store"
    Oraz z pola subject heading wybiorę opcję "<SubjectHeading>"
    Oraz W polu email wpiszę "a@a.pl"
    Oraz W polu message wpiszę "a"
    I Klikne przycisk submit
    Wtedy Zostanie wyświetlona informacja o wysłaniu formularza

    Przykłady:
      | SubjectHeading   |
      | Customer service |
      | Webmaster        |