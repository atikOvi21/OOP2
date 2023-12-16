public class Bottles {
    public String Song(){
        return Verses(99,0);
    }

    public String Verses(int upperBound, int lowerBound){
        StringBuilder lyrics = new StringBuilder();

        for(int i = upperBound; i >= lowerBound; i--){
            lyrics.append(Verse(i));
        }

        return lyrics.toString();
    }

    public String Verse(int lineNumber){
        String lyrics = "";

        switch (lineNumber) {
            case 0:
                lyrics += """
                        No more bottles of beer on the wall , no more bottles of beer .
                        Go to the store and buy some more , 99 bottles of beer on the wall .
                        """;
                break ;

            case 1:
                lyrics += """
                        1 bottle of beer on the wall , 1 bottle of beer .
                         Take it down and pass it around , no more bottles of beer on the wall .
                        """;
                break ;

            case 2:
                lyrics += """
                        2 bottles of beer on the wall , 2 bottles of beer .
                         Take one down and pass it around , 1 bottle of beer on the wall .
                        """;
                break ;

            case 89:
                lyrics += """
                        89 bottles of beer on the wall , 89 bottles of beer .
                         Take one down and pass it around , 88 bottles of beer on the wall .
                        """;
                break ;

            case 98:
                lyrics += """
                        98 bottles of beer on the wall , 98 bottles of beer .
                        Take one down and pass it around , 97 bottles of beer on the wall .
                        """;
                break ;

            case 99:
                lyrics += """
                        99 bottles of beer on the wall , 99 bottles of beer .
                        Take one down and pass it around , 98 bottles of beer on the wall .
                        """;
                break ;
        }

        return lyrics;
    }
}