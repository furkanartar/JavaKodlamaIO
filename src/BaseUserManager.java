public class BaseUserManager<TEntity extends User>  {
    public void Add(TEntity tentity){
        System.out.println(tentity.getUserName() + " eklendi");
    }

    public void Update(TEntity tentity){
        System.out.println(tentity.getUserName() + " güncellendi");
    }

    public void GetAll(TEntity tentity){
        System.out.println(tentity.getUserName() + " getirildi");
    }

    public void Delete(TEntity tentity){
        System.out.println(tentity.getUserName() + " silindi");
    }
}
