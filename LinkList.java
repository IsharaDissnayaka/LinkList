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

    public void InsertFirst(int Key){
        Link newLink = new Link(Key);
        newLink.Next= First;
        First = newLink;
    }

    public Link Delete(){
        Link tepm =First;
        First=First.Next;
        return tepm;                                                
    } 
    
    public boolean InsertAfter(int Key,int num){
    //    Link Newlink = new Link(num);
       
    //    Link cur = First;


    //    while(cur==null){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    //        if(cur.Intdata==Key){
    //            Newlink.Next=cur.Next;
    //            cur.Next=Newlink;
    //            return true;
    //        }else{
    //         cur = cur.Next;
    //        }
    //    }

    //    return false;


        Link curr = FindLink(Key);
        if(curr != null){
            Link newlink = new Link(num);
            newlink.Next=curr.Next;
            curr.Next=newlink;
            return true;
        }else{
            return false;
        }
    }

    public boolean DeleteMidd(int Key){
         Link cur = First;
         Link Perviors= First;

         while(cur==null){
            if(cur.Intdata==Key){
                if(cur==First){
                   First=First.Next;
                   return true;
                }else{
                    Perviors.Next=cur.Next;
                }
                
                return true;
            }else{
                Perviors=cur;
                cur=cur.Next;
            }
         }

         return false;
    }


    public boolean Find(int key){

        Link currunt = First;

        while(currunt!= null){
            if(currunt.Intdata ==key){
                 return true;
            }

            else{
                currunt = currunt.Next;
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        }
        return false;
    }


    public Link FindLink(int key){

        Link currunt = First;

        while(currunt!= null){
            if(currunt.Intdata ==key){
                 return currunt;
            }

            else{
                currunt = currunt.Next;
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        }
        return null;
    }
}
