public class MyClass {

    String myName;
    String mySurName;
    String [] lessons = new String[]{"Teoria","Practica","English","Soft Skill"};
    String favoriteFood;

    String myHobby;





    public MyClass(String myName,String mySurName,String [] lessons ,String favoriteFood ){
        this.myName = myName;
        this.mySurName = mySurName;
        this.lessons = lessons;
        this.favoriteFood = favoriteFood;
    }
    public MyClass(String myName,String mySurName,String myHobby,String favoriteFood ){
        this.myName = myName;
        this.mySurName = mySurName;
        this.myHobby = myHobby;
        this.favoriteFood = favoriteFood;
    }




}
