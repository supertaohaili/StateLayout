# StateLayout

```java
allprojects {
    repositories {
	  ...
	  maven { url 'https://jitpack.io' }
    }
}

dependencies {
       compile 'com.github.supertaohaili:StateLayout:1.0.0'
}
```

```
//首先配置一下：
 StateManager mStateManager = StateManager.builder(this)//通过Build模式构建。
                .setContent(textView)//为哪部分内容添加状态管理。这里可以是Activity，Fragment或任何View。
                .setLoadingView(R.layout.state_loading)//设置Loading的布局样式。
                .setLoadingText("加载我只服你…")//当然要想这个文字起作用，布局中的TextView的id必须为tv_loading_state。
                .setEmptyView(R.layout.state_empty)//设置空数据的布局样式。
                .setEmptyImage(R.drawable.ic_empty_state_200px)//当然要想设置图片起作用，ImageView的id必须为iv_empty_state。
                .setEmptyText("大爷，实在是没有数据了")//当然要想这个文字起作用，布局中的TextView的id必须为tv_empty_state。
                .setEmptyOnClickListener(new StateListener.OnClickListener() {//设置点击事件。
                    @Override
                    public void onClick(View view) {
                        showToast("空状态");
                    }
                })
                .setErrorView(R.layout.state_error)//设置异常状态的布局样式。
                .setErrorImage(R.drawable.ic_empty_state_200px)//当然要想设置图片起作用，ImageView的id必须为iv_error_state。
                .setErrorText("大爷，出错了")//当然要想这个文字起作用，布局中的TextView的id必须为tv_error_state。
                .setErrorOnClickListener(new StateListener.OnClickListener() {//设置点击事件。
                    @Override
                    public void onClick(View view) {
                        showToast("错误状态");
                    }
                })
                .setNetErrorView(R.layout.state_net_error)//设置网络异常状态的布局样式。
                .setNetErrorImage(R.drawable.ic_empty_state_200px)//当然要想设置图片起作用，ImageView的id必须为iv_net_error_state。
                .setNetErrorText("大爷，有人拔网线了")//当然要想这个文字起作用，布局中的TextView的id必须为tv_net_error_state。
                .setNetErrorOnClickListener(new StateListener.OnClickListener() {//设置点击事件。
                    @Override
                    public void onClick(View view) {
                        showToast("谁拔了我的网线");
                    }
                })
                .build();
 
//在需要用到的地方切换状态。

mStateManager.showLoading();//切换到Loading状态

mStateManager.showEmpty();//切换到空数据状态

mStateManager.showError();//切换到异常状态

mStateManager.showNetError();//切换到网络异常状态

mStateManager.showContent();//切换到默认状态

```

## 高级用法：
你也可以自己定制状态页面样式


```
mStateManager = StateManager.builder(this)
                .setContent(recyclerView)
                .setEmptyView(R.layout.state_custom_empty)
                .setErrorView(R.layout.state_custom_error)
                .setLoadingView(R.layout.state_custom_loading)
                .setConvertListener(new StateListener.ConvertListener() {
                    @Override
                    public void convert(BaseViewHolder holder, StateLayout stateLayout) {
                        holder.setOnClickListener(R.id.bt0, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                ToastUtils.showToast(RecyclerView.this, "点击了正中间");
                            }
                        }).setOnClickListener(R.id.bt1, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                ToastUtils.showToast(RecyclerView.this, "点击了左上角");
                            }
                        }).setOnClickListener(R.id.bt2, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                ToastUtils.showToast(RecyclerView.this, "点击了右上角");
                            }
                        }).setOnClickListener(R.id.bt3, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                ToastUtils.showToast(RecyclerView.this, "点击了左下角");
                            }
                        }).setOnClickListener(R.id.bt4, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                ToastUtils.showToast(RecyclerView.this, "点击了右上角");
                            }
                        }).setOnClickListener(R.id.tv_error, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                ToastUtils.showToast(RecyclerView.this, "出错了");
                            }
                        }).setOnClickListener(R.id.tv_loading, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                ToastUtils.showToast(RecyclerView.this, "刷新");
                            }
                        });
                    }
                })
                .build();
```



### Known Issues
If you have any questions/queries/Bugs/Hugs please mail @
taohailili@gmail.com

```
