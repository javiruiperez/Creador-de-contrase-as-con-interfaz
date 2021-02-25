import java.util.Random;

public class Generador {
    private static String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
    private static String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String numeros = "1234567890";
    private static String signos = "ºª!|@·#$~%½&¬/{([)]=}'?¡¿ñÑ,;.:-_";

    public static String generarContraseña(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMinusculas + letrasMayusculas + numeros + signos;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }

    public static String generarContraseña2(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMinusculas;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña3(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMayusculas;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña4(int numeroCaracteres){
        String contraseña = "";
        String caracteres = numeros;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña5(int numeroCaracteres){
        String contraseña = "";
        String caracteres = signos;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña6(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMinusculas + letrasMayusculas;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña7(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMinusculas + letrasMayusculas + numeros;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña8(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMayusculas + numeros;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña9(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMayusculas + numeros + signos;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }public static String generarContraseña10(int numeroCaracteres){
        String contraseña = "";
        String caracteres = numeros + letrasMinusculas;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña11(int numeroCaracteres){
        String contraseña = "";
        String caracteres = numeros + letrasMayusculas;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña12(int numeroCaracteres){
        String contraseña = "";
        String caracteres = numeros + signos;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }
    public static String generarContraseña13(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMinusculas + signos;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }public static String generarContraseña14(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMayusculas + signos;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }public static String generarContraseña15(int numeroCaracteres){
        String contraseña = "";
        String caracteres = letrasMinusculas + letrasMayusculas + signos;
        Random rnd = new Random();
        while(contraseña.length() < numeroCaracteres){
            contraseña = contraseña + caracteres.charAt(rnd.nextInt((caracteres.length() - 1)));
        }

        return contraseña;
    }




}
