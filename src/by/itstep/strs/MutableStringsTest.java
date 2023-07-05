package by.itstep.strs;

public class MutableStringsTest {
    public static void main(String[] args) {
        StringBuffer sBuff;


        StringBuilder sBuild = new StringBuilder() ;
        sBuild.append("Hello");
String str = null;
        sBuild.append(str);
        sBuild.append(123).append("world").append("!!!!!!!!!!!!");
        System.out.println(sBuild);

        StringBuilder sBuild2 = new StringBuilder(128) ;
        sBuild2.append("Hello world ");
        sBuild2.append("Hello world ");
        sBuild2.append("Hello world ");
        System.out.println(sBuild2);


        StringBuilder sBuild3 = new StringBuilder("1024") ;
        System.out.println(sBuild3 );

        StringBuilder sBuild4 = new StringBuilder(sBuild) ;
        System.out.println(sBuild4 );

        StringBuilder sBuild41= new StringBuilder(sBuild.append(sBuild2)) ;
        System.out.println(sBuild41 );


        System.out.println(sBuild4.reverse());

        System.out.println("capacity : " + sBuild4.capacity());
        System.out.println("length : "  + sBuild4.length());
        System.out.println("free : " + (sBuild4.capacity() -  sBuild4.length()));


        sBuild4.toString().split(" ");
        String words[]= sBuild4.toString().split(" ");
        for (String word : words){
            System.out.println(word);
        }


        HTMLTableBuilder htmlTable = new HTMLTableBuilder();

        htmlTable.addHeaders("id", "lastName" , "AVG");

//htmlTable.addStudents("1","");

        System.out.println(htmlTable.build());


    }



}

