package com.mkyong;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.mkyong.stock.Person;
import com.mkyong.stock.PersonDetails;
import com.mkyong.stock.Stock;
import com.mkyong.stock.StockDetail;
import com.mkyong.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Query q = session.createQuery("FROM Person where PID=:personid");
		q.setParameter("personid", 1);
		List l = q.list();
		System.out.println(l);

		Criteria cr = session.createCriteria(Person.class);
		//cr.setProjection(Projections.property("pname"));
		cr.addOrder(Order.asc("pname"));
		//cr.setProjection(Projections.rowCount());
		//cr.add(Restrictions.isNotNull("pname"));
		//cr.setProjection(Projections.property("pname")); 
		//cr.setProjection(Projections.rowCount());

		List list = cr.list();
		System.out.println(list);
	
	/*	Person  personOne = (Person) session.load(Person.class, 1);
		System.out.println(personOne.getPname());
		Query query = session.createQuery("FROM Person");
		query.setCacheable(true);
		List users = query.list();
		System.out.println(users.get(0));
		session.getTransaction().commit();
		session.close();
		Session session1 = HibernateUtil.getSessionFactory().openSession();

		session1.beginTransaction();
	
		Person  personTwo = (Person) session1.load(Person.class, 1);
		System.out.println(personTwo.getPname());
		Query query1 = session1.createQuery("FROM Person");
		query1.setCacheable(true);
		List users1 = query1.list();
		System.out.println(users1.get(0));
		session1.getTransaction().commit();
		session1.close();*/
		
		
		
/*		

		Stock stock = new Stock();

		stock.setStockCode("7052");
		stock.setStockName("PADINI");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("PADINI Holding Malaysia");
		stockDetail.setCompDesc("one stop shopping");
		stockDetail.setRemark("vinci vincii");
		stockDetail.setListedDate(new Date());
		stockDetail.setStock(stock);
		StockDetail stockDetail1 = new StockDetail();
		stockDetail1.setCompName("PADINI Holding Malaysia");
		stockDetail1.setCompDesc("one stop shopping");
		stockDetail1.setRemark("vinci vincii");
		stockDetail1.setStock(stock);
		stockDetail1.setListedDate(new Date());
		stock.getStockDetail().add(stockDetail1);
		stock.getStockDetail().add(stockDetail);
		
		//stock.setStockDetail(stockDetail);
		//stockDetail.setStock(stock);
		session.save(stock);
		session.save(stockDetail);
		session.save(stockDetail1);*/
		/*Person p = new Person();
		p.setPname("test");
		
		PersonDetails pd = new PersonDetails();
		pd.setAddress("Bangalore");pd.setDob(1986);
		p.setPdetails(pd);
		session.save(p);*/
		session.getTransaction().commit();

		System.out.println("Done");
	}
}
