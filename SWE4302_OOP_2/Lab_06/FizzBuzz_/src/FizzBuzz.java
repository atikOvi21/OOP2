public class FizzBuzz {
    public FizzBuzz(){
    }

    public String getFizzyBuzz(int n){
        return getFizzbuzz(n, 3, 7);
    }

    public String getFizz(){
        return "Fizz";
    }

    public String getBuzz(){
        return "Buzz";
    }

    public String getFizzbuzz(int n, int toBeDividedBy, int alsoToBeDividedBy){
        if(n % toBeDividedBy == 0 && n % alsoToBeDividedBy == 0)
            return "Fizzbuzz";
        else if(n % toBeDividedBy == 0)
            return this.getFizz();
        else if(n % alsoToBeDividedBy == 0)
            return this.getBuzz();

        return "Gotcha";
    }
}
