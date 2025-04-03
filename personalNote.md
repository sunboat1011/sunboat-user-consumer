# 个人笔记
+ 终端执行 ，生成项目结构

  ```
  tree > project_structure.txt 
  ```
+ 业务模块[template-business-module]引用公共模块[template-common-module]，配置私库后，在本地的 maven 的 setting 文件中
+ + 基础配置<serve> 个人存储库的用户和密码
  + <mirror> 个人存储库的链接
  + <profile>设置 snapshot 更新策略为 always，方便 common 部分改动时，不用手动 deploy，business 模块可以直接获取到最新的改动