package nightmare_app;
import java.io.Serializable;
public class Member implements  Serializable{ //class is capable of being serialized
   private String id;
   private String email;
   private String name;
   private String WutRu;

   public Member(String id , String email , String name , String WutRu){ //WutRu = slang for 'Whatareyou' to specify what the person is...
      this.email= email;
      this.name= name;
      this.id=id;
      this.WutRu=WutRu;
   }

   public String getId() {
      return id;
   }

   public String getEmail() {
      return email;
   }

   public String getName() {
      return name;
   }

   public String getWutRu() {
      return WutRu;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setWutRu(String wutRu) {
      WutRu = wutRu;
   }

}
