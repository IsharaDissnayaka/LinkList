public class LinkList {

    private Link First;

    public LinkList(){
        First =null;
    }

    public void DisplayList(){
        Link cur = First;

        while(cur==null){
            cur.DisplayaLink();
            cur = cur.Next;
        }

        System.out.println("");
    }

    public void Insert(int num){
        Link newLink = new Link(num);
        newLink.Next= First;
        First = newLink;
    }

    public Link Delete(){
        Link tepm =First;
        First=First.Next;
        return tepm;
    } 
    
    public boolean InsertIndex(int Key,int num){
       Link Newlink = new Link(num);
       
       Link cur = First;


       while(cur==null){
           if(cur.Intdata==Key){
               Newlink.Next=cur.Next;
               cur.Next=Newlink;
               return true;
           }else{
            cur = cur.Next;
           }
       }

       return false;
    }

    public boolean DeleteIsert(int Key){
         Link cur = First;
         Link Perviors= First;

         while(cur==null){
            if(cur.Intdata==Key){
                Perviors.Next=cur.Next;
                return true;
            }else{
                Perviors=cur;
                cur=cur.Next;
            }
         }

         return true;
    }
}
