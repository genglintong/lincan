# Java 练习项目集合

本项目按日期组织Java练习代码，方便管理和查看不同时期的练习内容。

## 项目结构

```
lincan/
├── run_project.sh              # 项目运行脚本
├── README.md                   # 项目说明文档
├── 20251228/                   # 2025年12月28日的练习项目
│   ├── conditional-logic/      # 条件判断逻辑
│   │   └── Text1.java         # 性别厕所选择器
│   ├── name-lookup/           # 名单查询系统  
│   │   └── Text2.java         # 学生名单查询
│   ├── score-analyzer/        # 成绩分析器
│   │   └── Text3.java         # 成绩统计分析
│   ├── score-sorter/          # 成绩排序器
│   │   └── Text6.java         # 成绩排序功能
│   ├── savings-calculator/    # 储蓄计算器
│   │   └── Text4.java         # 存钱计算
│   └── bank-account/          # 银行账户管理
│       ├── Account.java       # 账户类
│       └── Text5.java         # 账户演示
└── [future dates]/            # 未来日期的练习项目
    └── ...
```

## 项目说明

### 2025年12月28日练习项目

#### 1. 条件判断逻辑 (conditional-logic)
- **文件**: `Text1.java`
- **功能**: 根据输入的性别字符判断应该去哪个厕所
- **知识点**: 条件判断、Scanner输入

#### 2. 名单查询系统 (name-lookup)
- **文件**: `Text2.java`
- **功能**: 根据编号查询学生姓名
- **知识点**: 数组操作、条件判断
- **注意**: 原代码第10行有语法错误（空for循环），但保持原样

#### 3. 成绩统计分析
- **文件**: `Text3.java` (score-analyzer), `Text6.java` (score-sorter)
- **功能**: 
  - Text3.java: 计算成绩的最高分、总分、平均分和及格率
  - Text6.java: 对成绩进行排序并显示前十名
- **知识点**: 数组遍历、数学计算、排序算法
- **注意**: Text6.java第18行逻辑有问题，但保持原样

#### 4. 储蓄计算器 (savings-calculator)
- **文件**: `Text4.java`
- **功能**: 计算达到目标金额需要多少年
- **知识点**: 循环控制、数学计算

#### 5. 银行账户管理 (bank-account)
- **文件**: `Account.java`, `Text5.java`
- **功能**: 模拟银行账户的存取款操作
- **知识点**: 面向对象编程、封装
- **注意**: Text5.java依赖Account.java，需要同时编译

## 运行方式

### 使用运行脚本（推荐）
```bash
# 给脚本执行权限（首次运行）
chmod +x run_project.sh

# 查看帮助
./run_project.sh --help

# 运行指定日期和项目
./run_project.sh 20251228 conditional-logic
./run_project.sh 20251228 name-lookup
./run_project.sh 20251228 score-analyzer
./run_project.sh 20251228 score-sorter
./run_project.sh 20251228 savings-calculator
./run_project.sh 20251228 bank-account
```

### 手动编译运行
```bash
# 进入对应项目目录
cd 20251228/conditional-logic

# 编译并运行
javac Text1.java
java Text1

# 银行账户项目需要同时编译两个文件
cd ../bank-account
javac Account.java Text5.java
java Text5
```

## 添加新的练习项目

当需要添加新日期的练习时：

1. 创建新的日期目录：`mkdir YYYYMMDD`
2. 在日期目录下创建功能分类的子目录
3. 将Java文件放入对应的子目录
4. 更新运行脚本以支持新的日期和项目

## 注意事项

1. **原始代码保持不变**: 所有代码都保持原始状态，包括存在的小错误
2. **简化运行**: 每个项目独立目录，无包依赖，直接编译运行
3. **编译清理**: 运行脚本会自动清理编译生成的.class文件
4. **错误处理**: 如遇到编译错误，请检查Java环境是否正确安装

## 学习建议

1. **按顺序学习**: 从简单的条件判断开始，逐步学习复杂概念
2. **理解原理**: 不仅要能运行代码，更要理解每段代码的作用
3. **发现问题**: 注意原始代码中的错误，思考如何改进
4. **举一反三**: 在理解原理的基础上，尝试编写类似功能的代码