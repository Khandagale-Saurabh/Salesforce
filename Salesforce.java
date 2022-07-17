Imp
https://techilaservices.com/blog/what-are-salesforce-objects/

Object Manager
1]field : we create filed
2]compact layout: mobile,tab ki liye kse dekhana hai
3] 


Opportunities are deals in progress. Opportunity records track details about deals
,including which accounts they're for, who the players are, and the amount of potential sales

WorkFlow Rule Action Type:
Task:
Email Alert:
Field Update:
Outbound Message:


=================================
  Trigger:
Trigger AccoTrig on Account(Before Insert, Afert delete)
{
}


=================================
  Q1] how to prevent data loss 
  we can use data loader to store it in local machine and import in from local machine
  
  2] role : when you have to hide [recod level security ] eg: boss[All record]->emp-> sub-emp[onlu his recored]
 Profile: objec, filed ,admin perission login hrs
 
 3] view state error: some time data will cached and when chache size >180 it will give eroor
 4] ajex tag: action poller & action staus, action regin
 5] how to write trigger best practice [crete  different class for logic and call it inside trigger]
 
   
   6] isbalck vs isnull:it return false when there is balnk
   7]A ->b[look up]
   =>  select id,name(select phone from b__r) from A;
      8] Api type: record type.developer_name
      9] wrapper class in salesfors [our own object like Intger]
      10]odi: contact & leave object
      & whatid: other than conatct & leave
      
      
      11] mix dml exception : setup & non-setup object mai recored insert krte 
      
      12] Asyscrnouse method: feture,quable & batch & scheduable
       differenceof all
       
       13] type of exeption face in projects   https://www.youtube.com/watch?v=tefYBN3Rv0c
       14] before: before store in database
            after: after storing in databse
            
       15]Force vs salesforces:
            force: it give demo envornemt
            salesforces give : developmet enviormnet
   
