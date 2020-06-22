package Main;

public class DogFactory {

    public static Dog createDog(String str){

        if(str.equals("German Shepherd")){
            return new GermanShepherd();
        } else if (str.equals("Husky")){

            return new Husky();
        } else if (str.equals("Golden Retriever")){
            return new GoldenRetriever();
        }


        return null;
    }

}
