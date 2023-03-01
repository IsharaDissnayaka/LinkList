public class Link {
    public int Intdata;
    public Link Next;

    public Link(int number){
         this.Intdata=number;
         this.Next=null;
    }

    public void DisplayaLink(){
        System.out.println(Intdata);
    }
}
