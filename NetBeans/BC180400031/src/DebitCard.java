/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jawwad
 */
public class DebitCard {
    private int id;
    private String userName;
    private String cardNo;
    private int cardPin;
    private long balance;
	
	public DebitCard()
	{
                id=0;
                userName=null;
                cardNo=null;
		cardPin=0;
		balance=0;
	}
	public DebitCard(int i, String us,String c_no, int p, long b)
	{
                this.id=i;
                this.userName=us;
		this.cardNo=c_no;
		this.cardPin=p;
		this.balance=b;
	}
	public DebitCard(DebitCard dc)
	{
                this.id=dc.id;
                this.userName=dc.userName;
		this.cardNo=dc.cardNo;
		this.cardPin=dc.cardPin;
		this.balance=dc.balance;
        }
        public void setId(int i)
	{
		this.id=i;
	}
        public void setUsername(String us)
	{
		this.userName=us;
	
        }
	public void setcardNo(String c_no)
	{
		this.cardNo=c_no;
	}
	public void setpin(int p)
	{
		this.cardPin=p;
	}
	public void setbalance(long b)
	{
		this.balance=b;
	}
	
        public int getId()
        {
                return this.id;
        }
        public String getUsername()
        {
                return this.userName;
        }
	public String getcardNo()
	{
		return cardNo;
	}
	public int getpin()
	{
		return cardPin;
	}
	public long getbalance()
	{
		return balance;
	}
    
}
