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
  
3 tell all android application 组建
    http://blog.csdn.net/zongzhankui/article/details/44002489
    显式Intent：显式Intent明确指定需要启动或者触发的组件的名称。
    隐式Intent：隐式Intent只是指定需要启动或者触发的组件应满足怎样的条件。
    对于显式Intent而言，Android系统无须对该Intent做任何解析，系统直接找到指定的目标组件，启动或触发它即可。
    对于隐式Intent而言，Android系统需要对该Intent进行解析，解析出它的条件，然后再去系统中查找与之匹配的目标条件。如果找到符合条件的组件，就启动或触发它们。
    那么Android系统如何判断被调用组件是否符合隐式Intent呢？这就需要靠IntentFilter来实现了，被调用组件可通过IntentFilter来声明自己所满足的条件——也就是声明自己到底能处理哪些隐式Intent。

  
 
