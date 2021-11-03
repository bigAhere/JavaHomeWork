package com.pb.Kazachuk.HW6;

import com.pb.Kazachuk.HW5.Book;
import sun.misc.Cleaner;

import java.lang.reflect.Constructor;

public class VetСlinic {

    public static void main(String[] srgs){

        Animal[] animals = {
                new Cat(), new Dog(), new Horse()
        };

        animals[1].food = "листья";
        animals[0].location = "где тепло";

        System.out.println(animals[2].food);

        for (int i=0; i < animals.length; i++ ){
            try {
                Class veterinar = Class.forName("com.pb.Kazachuk.HW6.Veterinarian");
                Constructor constr = veterinar.getConstructor(new Class[] {});
                Object obj = constr.newInstance();

                if(obj instanceof Veterinarian){
                    ((Veterinarian) obj).treatAnimal(animals[i]);
                }

            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
