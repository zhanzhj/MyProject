--外呼绩效
create TABLE t_waihu_jixiao(
	userNo	VARCHAR(20) PRIMARY KEY, --用户工号
	userName varchar(50), --用户姓名
	waihu_wancheng_rate double, --外呼完成率
	waihu_wancheng_score1 double, --外呼分数一
	waihu_wancheng_score2 double, --外呼分数一
	...
);
