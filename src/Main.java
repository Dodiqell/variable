public class Main { public static void main(String[] args) {
       var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
    System.out.println(cat);
    var paper = 763789;
    System.out.println(paper);
    dog = dog + 4;
    System.out.println(dog);
    cat = cat + 4;
    System.out.println(cat);
    paper = paper + 4;
    System.out.println(paper);
    dog = dog - 3.5;
    System.out.println(dog);
    cat = cat - 1.6;
    System.out.println(cat);
    paper = paper - 7639;
    System.out.println(paper);

    var friend = 19;
    System.out.println(friend);
    friend = friend * 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);
    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);

    var oneBoxerWeight = 78.2;
    var twoBoxerWeight = 82.7;
    var totalWeight = oneBoxerWeight + twoBoxerWeight;
    System.out.println("Общий вес боксеров " + totalWeight + " кг.");
    var differenceWeight = oneBoxerWeight - twoBoxerWeight;
    System.out.println("Разница в весе боксеров " + differenceWeight + " кг.");
    var total = twoBoxerWeight - oneBoxerWeight;
    System.out.println(total);
    var overWeight = twoBoxerWeight % oneBoxerWeight;
    System.out.println(overWeight);
    var totalWorkTime = 640;
    var workTimeOnePeople = 8;
    System.out.println("Всего работников в компании " + totalWorkTime / workTimeOnePeople + " человек");
    var worker = totalWorkTime / workTimeOnePeople + 94;
    System.out.println("Если в компании работает " +  worker + " человек, то всего " + totalWorkTime / worker + " часа работы может быть поделено между сотрудниками.");




    }
}