
`
Day 1
``
```sql
select e.ename ,d.dname from emps e 
inner join depts d on e.deptno=d.deptno;

select e.ename ,d.dname from emps e 
left join depts d on e.deptno=d.deptno;
```


```sql

-- self join

select e.ename,m.ename mname from emps e
inner join emps m on e.empno=m.mgr;

select e.ename,m.ename mname from emps e
inner join emps m on e.mgr=m.empno;

select e.ename,m.ename mname from emps e
left join emps m on e.mgr=m.empno;

```

```sql
--group by clause with join

select deptno ,count(e.empno) from emps e
group by deptno; 

select d.dname,count(*) from emps e
inner join depts d on d.deptno=e.deptno
group by d.dname;

select d.dname,count(*) from emps e
left join depts d on d.deptno=e.deptno
group by d.dname;

```


```sql
-- multiple join

--print ename ,tal & dname
select e.ename,d.dname,a.tal from emps e
inner join addr a on e.empno=a.empno 
inner join depts d on d.deptno=e.deptno;

select e.ename,d.dname,a.tal from emps e
inner join addr a on e.empno=a.empno 
left join depts d on d.deptno=e.deptno;

--print ename,meeting topic

select e.ename ,m.topic from emps e
inner join  emp_meeting em on e.empno=em.empno
inner join meeting m on em.meetno=m.meetno;

-- print ename, meeting topic, addr
select e.ename ,m.topic, a.tal from emps e
inner join  emp_meeting em on e.empno=em.empno
inner join meeting m on m.meetno=em.meetno
inner join addr a on a.empno=e.empno;


-- print ename, meeting topic, addr,dname

select e.ename ,m.topic, a.tal,d.dname from emps e
inner join  emp_meeting em on e.empno=em.empno
inner join meeting m on m.meetno=em.meetno
inner join addr a on a.empno=e.empno
inner join depts d on d.deptno=e.deptno;

```


```sql 

-- analytical query 
-- with rollup

select deptno ,sum(sal) from emp 
group by deptno;

select sum(sal) from emp;


select deptno ,sum(sal) from emp 
group by deptno
union
select 'total ',sum(sal) from emp;


select deptno ,sum(sal) from emp 
group by deptno,job
union
select deptno ,sum(sal) from emp 
group by job,deptno;

select deptno ,sum(sal) from emp 
group by deptno
with rollup;


select deptno  from emp 
group by deptno
with rollup;
```


```sql
-- Assignment 

salespeople(snum,sname,city,comm)
customers(cnum,cname,city,rating,snum)
orders(onum,amt,odate,cnum,snum)

Select distinct o.cnum,c.cname from customers c 
inner join orders o on c.cnum=o.cnum;

1]
select s.sname ,c.cname,o.onum from salespeople s
inner join customers c on s.snum=c.snum 
inner join orders o on o.cnum=c.cnum;

2]
select s.sname ,c.cname,o.onum from salespeople s
left join customers c on s.snum=c.snum 
inner join orders o on o.cnum=c.cnum;

3]
select c.cname,s.sname,s.comm from customers c
inner join salespeople s on c.snum=s.snum
where s.comm >0.12;

4]
select s.sname,(s.comm)*o.amt as commition from salespeople s
inner join orders o on s.snum=o.snum
inner join customers c on c.cnum=o.cnum
where c.rating >100;

5]
select  s.sname,s2.sname ,s.city from salespeople s
inner join salespeople s2 on s.city=s2.city
where s.snum<s2.snum;

6]
select o.onum, sum(s.comm*o.amt) as commition from salespeople s
inner join orders o on s.snum=o.snum
group by o.onum
with rollup;

7]
select s.sname, count(c.cnum) as customer_cnt from salespeople s
inner join customers c on s.snum=c.snum
group by s.sname;

8]
select c.cname ,s.sname ,max(o.amt) max_amount from customers c
inner join salespeople s on c.snum=s.snum 
inner join orders o on o.snum=s.snum
GROUP BY c.cname, s.sname;

select c.cname ,s.sname ,max(o.amt) max_amount from customers c
left join salespeople s on c.snum=s.snum 
inner join orders o on o.snum=s.snum
GROUP BY c.cname, s.sname;

