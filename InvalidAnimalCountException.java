
//* Клас InvalidAnimalCountException застосовується в перевірці правильності вводу кількості тварин
// та видає попередження, якщо введено некоректну кількість
public class InvalidAnimalCountException extends Exception{
    public InvalidAnimalCountException (String message){
        super(message);
    }

}
