public class GetData {
    public static Student fbDataForStudent(String name) {
        return new Student(name);
    }

    public static Student[] canvaStudentsInClass(String className) {
        //1. ToDo: Get json object for class from canva

        int size = 10; // ToDo: this should be the length of the json object

        Student[] students = new Student[size];
        for (Student student : students) {
            student = new Student(""); //2. ToDo: populate each student correctly using the json object
        }

        return students;
    }

//    public void read() {
//        // parsing file "JSONExample.json"
//        Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
//
//        // typecasting obj to JSONObject
//        JSONObject jo = (JSONObject) obj;
//
//        // getting firstName and lastName
//        String firstName = (String) jo.get("firstName");
//        String lastName = (String) jo.get("lastName");
//
//        System.out.println(firstName);
//        System.out.println(lastName);
//
//        // getting age
//        long age = (long) jo.get("age");
//        System.out.println(age);
//
//        // getting address
//        Map address = ((Map)jo.get("address"));
//
//        // iterating address Map
//        Iterator<Map.Entry> itr1 = address.entrySet().iterator();
//        while (itr1.hasNext()) {
//            Map.Entry pair = itr1.next();
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
//
//        // getting phoneNumbers
//        JSONArray ja = (JSONArray) jo.get("phoneNumbers");
//
//        // iterating phoneNumbers
//        Iterator itr2 = ja.iterator();
//
//        while (itr2.hasNext())
//        {
//            itr1 = ((Map) itr2.next()).entrySet().iterator();
//            while (itr1.hasNext()) {
//                Map.Entry pair = itr1.next();
//                System.out.println(pair.getKey() + " : " + pair.getValue());
//            }
//        }
//    }
}
