package encapsulation;

 class Employee {
     private int id;
     private String name;

     public int getId()
     {
         return id;
     }

     public void setId(int i) {
         this.id = i;
     }

     public String getName(String name) {
         return name;
     }

     public void setName(String n) {
         this.name = n;
     }




         public static void main(String[] args) {
             Employee obj= new Employee();
             obj.setId(2);
             System.out.println(obj.getId());

         }
     }
