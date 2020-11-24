public class First {
    public static void main(String banana[]){
        int intVar = 1;

        long longVar = 350L;

        float floatVar = 1.1f;

        short shortVar = 5;

        double doubleVar = 3.5;

        boolean trueOrFalse = true;

      String resultado =  intReturn(50,546);
        System.out.println(resultado);

        String isOddMethod = isOdd(3);

        System.out.println(isOddMethod);
        String  stringVar = "asbaba";

       System.out.println(switchCase(50));

    }
    public  String asbaba(){


        return "monkey";
    }

    private static String intReturn(int a, int b){
        int conta = a+b;
    return "O resultado é " +  conta;
    }
    public static String isOdd(int a){
        if (a%2 == 0){
            return "O número"+a+ "é par";
        }

        return "O número "+a+ " é impar";
    }

    public static String switchCase(int mes){
        System.out.println(mes);
        switch(mes){
            case 1:
                return "Janeiro";

                case 2:
                    return "Fev";

                    case 3:
                        return "Mar";

                        case 4:
                            return "Abr";

                            case 5:
                                return "Maio";

                                case 6:
                                    return "Jun";

                                    case 7:
                                        return "Julh";

                                        case 8:
                                            return "Agos";

                                            case 9:
                                                return "Setem";

                                                case 10:
                                                    return "Out";

                                                    case 11:
                                                        return "Nov";



        }
        return  "Asbaba";
    }
}