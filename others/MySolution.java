=========core Android=========
1 Describe MVP
MVP架构背后的核心思想就是将Activity/Fragment变成一个单纯的View，负责展示数据并将各种事件分发给中间人，也就是Presenter。
Presenter会处理每一个事件，从Model层获取或上传数据，并将获得的数据进行处理并让View层展示。
Presenter与View（这里是Activity/Fragment）的通信，是通过Activity/Fragment所继承的View接口来间接完成的。
这样数据展示过程的任务就分开了，并使测试更加方便，因为Presenter不包含任何依赖Android的代码。
延伸:如何保证MVP不会出现内存泄露（也即是P和View 的生命周期保持一致）
->通过Loader

2 Explain activity lifecycle.
  http://blog.sina.com.cn/s/blog_5ffeae360100ekoo.html
  网址链接中的实验6，谁在栈顶才会执行onrestart | 执行了ondestroy的 Activity 是不会重新走restart的 实验7中的如屏幕旋转

  
 
