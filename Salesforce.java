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
 Profile: objec, filed ,admin perission login hrs  [user will have only 1 profile]
 Permision : user can have many permission
 
 profile: for standard profile we cannot change everything [tab visisblit and application setting can be changerd] so because of this we create custome profile
 profile:
1]Tab visiblity
2]Admin permission [public document,Email Templates]
3] General user Permission [Manage email, manage lead, send mail, Report manege]
4]  @] Standard object permission[Account,opp,lead.....]=>read,create,edit,delete,viewAll,modifyAll
    @] Custom Object[]=>>read,create,edit,delete,viewAll,modifyAll
    {In real time you sholud not give delete permission always}
5] Session Setting : paswarod time , login hrs

 Q]User1 & user2 same profile with modify acess and owd is private for object wiill the manipute each other data.   
 Profile will override owd setting so user 1 & user 2can edit each other data.
   
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
16] dynamic dashboard ? can we schedule
No
=> https://chargent.force.com/kb/s/article/Salesforce-Dashboards-Static-vs-Dynamic-Dashboard

  17] if tryingyou have make filed, as read only but still it iseditable table then, there might be any after trigger involve to populste that value.
   
