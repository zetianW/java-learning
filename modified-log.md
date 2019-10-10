# 代码修改记录

## 2019.10.10
1. 将以前的代码和最近的代码分属在com.zetian.learned（已经学过的）和com.zetian.study（正在学习中的）包下
2. 将com.zetian.study.Runnable报名改为com.zetian.study.runnable
3. 新建com.zetian.study.base包，并将Employee相关的类放入其中。这样做的目的是：由于Employee在多种场景下被使用，但都是表示同一个类，因此将该类放在base(基础)包下，以后程序引用时，直接引用此包下的Employee类即可，不用重新创建