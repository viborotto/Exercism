class RaindropConverter {

    String convert(int number) {
      String sound = "";
        int[] arr = new int[number];
        for(int i=1; i<=number-1; i++){
            if(number%i==0){
                arr[i] = i;
            }
        }
        //percorrer array vendo se tem algum numero igual a 3,5,7
        for(int i=0; i<arr.length; i++){
            if(arr[i]==3){
                sound+="Pling";
            }
            if(arr[i]==5){
                sound+="Plang";
            }
            if(arr[i]==7){
                sound+="Plong";
            }
        }
        if (sound.isEmpty()){
            sound = Integer.toString(number);
        }
        System.out.println(sound);
        return sound;
    }

}
