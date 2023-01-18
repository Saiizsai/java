package L22__Regex;

public class Regex_Note {

    /*
    [013] A single digit 0,1, or 3.
    0 ka ny 3 hti 1lone pl yay loh ya

    [0–9][0–9] Any two-digit number from 00 to 99.

    A[0–4]b[05] A string that consists of four characters. The first
    character is A.The second character is 0,1,2,3, or 4.
    The third character is b. And the last character is
    either 0 or 5.
    __A 0 ka ny 4 hti yay loh ya
    __b 0 ka ny 5 hti 1lone pl yay loh ya

    [0–9&&[ˆ4567]] A single digit that is 0,1,2,3,8, or 9.
    ˆ4567 di num twy ko kyaw

    [a–z0–9] A single character that is either a lowercase letter or a
    digit.
    a to z / o to 9 hti yay loh ya

    *
    kyite 1lout yay loh ya

    +
    [0-9][0-9] 2 lone slone htae py ya
    output mhr di lo " 0 " 1lone hte htae loh ma ya


    X{N} Repeat X exactly N times, where X is a regular
    expression for a single character.

    X{N,} Repeat X at least N times.

    X{N,M} Repeat X at least N but no more than M times.
    [0-9]{2,5}
    0 to 9 a nae sone 2 khr a myr sone 5 khr hte py ya
    2 khr 5 khr htk po loh ll ma ya lo loh ll ma ya

    [wb](ad|eed) Matches wad,weed,bad, and beed.

    (pro|anti)-OO? Matches pro-OOP and anti-OOP.

    (AZ|CA|CO)[0–9]{4} Matches AZxxxx,CAxxxx, and COxxxx,
    where x is a single digit.

    \d "\\d" A single digit. Equivalent to [0–9].

    \D "\\D" A single nondigit. Equivalent to [^0–9].

    \s "\\s" A white space character, such as space,
    tab, new line, etc.

    \S "\\S" A non-white-space character.

    \w "\\w" A word character. Equivalent to
    [a–zA–Z_0–9].

    \W "\\W" A nonword character.

    \b "\\b" A word boundary (such as a white space
    and punctuation mark).

    \B "\\B" A nonword boundary


     */
}
