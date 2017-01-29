# language: pl

Funkcja:
  Jako użytkownik strony chcę mieć możliwość zalogowania się do swojego konta, aby mieć lepszą kontrolę nad swoimi zakupami

  Scenariusz:
  Wejscie na strone logowania przez klikniecie w link na stronie głównej

    Mając wyświetloną główną stronę sklepu
    Kiedy kliknę w link "Sign in"
    Wtedy zostanie wyświetlona strona o tytule "Login - My Store"
    I zostanie wyświetlone pole do wprowadzania loginu
    I zostanie wyświetlone pole do wprowadzania hasła
    I zostanie wyświetlony przycisk do logowania

  Scenariusz:
  Wejscie na strone logowania przez wpisanie adresu

    Kiedy jako adres podstrony wpiszę "index.php?controller=authentication&back=my-account"
    Wtedy zostanie wyświetlona strona o tytule "Login - My Store"
    I zostanie wyświetlone pole do wprowadzania loginu
    I zostanie wyświetlone pole do wprowadzania hasła
    I zostanie wyświetlony przycisk do logowania

  Szablon scenariusza:
  Wpisanie niepoprawnych danych logowania

    Kiedy jako adres podstrony wpiszę "index.php?controller=authentication&back=my-account"
    I w polu login wpiszę "<login>"
    I w polu haslo wpiszę "<haslo>"
    I kliknę w przycisk Sign in
    Wtedy Zostanie wyświetlona informacja o błędzie "<TekstBledu>"

    Przykłady:
      | login      | haslo | TekstBledu                 |
      |            |       | An email address required. |
      | aaaa       |       | Invalid email address.     |
      | aaaa@aa.pl |       | Password is required.      |
      |            | aa    | An email address required. |
      | aaaa@aa.pl | aa    | Invalid password.          |
      | aaaa@aa.pl | aaaaa | Authentication failed.     |

  Scenariusz:
  Wpisanie poprawnych danych logowania

    Kiedy jako adres podstrony wpiszę "index.php?controller=authentication&back=my-account"
    I w polu login wpiszę "test@test.pl"
    I w polu haslo wpiszę "test1"
    I kliknę w przycisk Sign in
    Wtedy zostanie wyświetlona strona o tytule "My account - My Store"