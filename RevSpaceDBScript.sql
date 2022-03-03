-----------------------------------------------
--DROPPERS--

	drop table if exists credentials;

drop table if exists likes;
	drop table if exists posts;
		drop table if exists users;

-----------------------------------------------
--CREATORS--

create table if not exists users (
	user_id serial primary key,
	email varchar(100) unique not null,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
	birthday bigint default null,
	revature_join_date bigint default null,
	github_username varchar(50) not null default '',
	title varchar(100) not null default '',
	location varchar(500) not null default '',
	aboutme varchar(1000) not null default ''
);

create table if not exists credentials (
	credentials_id serial primary KEY,
	user_id int references users(user_id) UNIQUE NOT NULL,
	password varchar(64) not null
);


create table posts (
	post_id serial primary key,
	creator_id int references users(user_id),
	body varchar,
	image varchar,
	date bigint,
	comment boolean,
	parent_post int references posts(post_id)
);

create table likes (
	like_id serial primary key,
	user_id int references users(user_id),
	post_id int references posts(post_id)
);

create table notifications(
	notifications_id serial primary key,
	messages varchar(250),
	sender_id int references users(user_id),
	receiver_id int references users(user_id),
	date localDate,
	time localDate,
	post_id int references posts(post_id)
);


--A user liked your post at 2/28 5:00pm
--A user commented on your post at...
--This user followed you


-----------------------------------------------
--POPULATORS--

	--REFERENCE TABLES--

	--MEAT TABLES--

	--TEST DATA--
insert into users values
	(default, 'username1@email.com', 'Charles', 'Mann', 0, 0, 'userGit1', 'someTitle', 'someTown', 'someThing'),
	(default, 'username2@email.com', 'Lacey', 'Irwin', 0, 0, 'userGit2', 'someTitle', 'someTown', 'someThing');

insert into credentials values
	(default, 1, 'Password1'),
	(default, 2, 'Password1');

insert into posts values 
	(default, 2, 'post1', 'https://i.imgur.com/s1L1qpB.jpeg', 1637815908000, false, null),
	(default, 1, 'post2', '', 1637400099000, false, null),
	(default, 1, 'post3', '', 1637400009000, false, null),
	(default, 1, 'post4', '', 1637400008000, false, null),
	(default, 1, 'post5', '', 1637400007000, false, null),
	(default, 1, 'post6', '', 1637400006000, false, null),
	(default, 1, 'post7', '', 1637400005000, false, null),
	(default, 1, 'post8', '', 1637400004000, false, null),
	(default, 1, 'post9', '', 1637400003000, false, null),
	(default, 1, 'post10', '', 1637400002000, false, null),
	(default, 1, 'post11', '', 1637400001000, false, null);

insert into posts values 					
	(default, 1, 'post2 level1 comment1 id3', '', 1637456178, true, 1),
	(default, 1, 'post2 level1 comment2 id4', '', 1637466178, true, 1),
	(default, 1, 'post2 level1 comment3 id5', '', 1637476178, true, 1),
	
	(default, 2, 'post1 level1 comment1 id6', '', 1637456178, true, 2),
	(default, 2, 'post1 level1 comment2 id7', '', 1637466178, true, 2),
	(default, 2, 'post1 level1 comment3 id8', '', 1637476178, true, 2);

insert into posts values 
	(default, 2, 'post2 level2 comment1 id9', '', 1637456178, true, 12),
	(default, 2, 'post2 level2 comment2 id10', '', 1637456178, true, 12),
	
	(default, 1, 'post1 level2 comment1 id11', '', 1637456178, true, 16),
	(default, 1, 'post1 level2 comment2 id12', '', 1637456178, true, 16);
	
