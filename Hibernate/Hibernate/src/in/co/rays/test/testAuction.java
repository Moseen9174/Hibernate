package in.co.rays.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.auction.Auction;
import in.co.rays.auction.Bid;
import in.co.rays.utill.HibDataSource;

public class testAuction {

	public static void main(String[] args) {
		Bid bid1=new Bid();
		bid1.setId(1);
		bid1.setAmmount(1000);
		bid1.setTimestamp("100");
		
		Bid bid2=new Bid();
		bid2.setId(1);
		bid2.setAmmount(2000);
		bid2.setTimestamp("200");
		
		Bid bid3=new Bid();
		bid3.setId(1);
		bid3.setAmmount(3000);
		bid3.setTimestamp("300");
		
		Set bids=new HashSet();
		bids.add(bid1);
		bids.add(bid2);
		bids.add(bid3);
		
		Auction item=new Auction();
		item.setId(1);
		item.setDescription("Moseen");
		item.setBids(bids);
		
		Session session = HibDataSource.getSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(item);
		
		tx.commit();
		
		session.close();
		
		
	}
	
}
