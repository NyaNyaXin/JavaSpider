# JavaSpider
程序功能：
爬取指定职位的信息，并保存到数据库
程序执行：
使用java -jar命令执行mvn生成的jar包即可
注意：
  1.程序首次运行时会先执行一次数据爬取流程以更新到最新的信息
  2.执行完之后，保持程序后台运行，每日的0点将会自动执行数据获取功能
  3.因为招聘网站信息的特殊性，每次执行数据保存操作都会清空原有的数据库，所以请在定时任务执行之前对数据进行自定义操作
