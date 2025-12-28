/**
 * 题目：多功能银行账户系统
 * 
 * 要求：
 * 1. 设计BankAccount类：
 *    - String accountNumber (账号)
 *    - String accountHolder (户主姓名)
 *    - double balance (余额)
 *    - String accountType (账户类型：储蓄/活期)
 *    - ArrayList<String> transactionHistory (交易记录)
 * 
 * 2. 实现方法：
 *    - deposit(double amount, String description) : 存款
 *    - withdraw(double amount, String description) : 取款  
 *    - transfer(BankAccount target, double amount) : 转账
 *    - getBalance() : 查询余额
 *    - printStatement() : 打印账单
 *    - calculateInterest(double rate) : 计算利息
 * 
 * 3. 主程序功能：
 *    - 创建多个账户
 *    - 模拟各种银行操作
 *    - 账户间转账
 *    - 生成交易报告
 * 
 * 4. 数据验证：
 *    - 取款不能超过余额
 *    - 金额必须为正数
 *    - 账户状态检查
 * 
 * 进阶要求：
 * - 使用ArrayList管理交易记录
 * - 实现账户冻结/解冻功能
 * - 支持定期存款计算（可选挑战）
 * - 生成格式化的对账单
 * 
 * 学习目标：
 * - 面向对象设计原则
 * - 集合类的使用(ArrayList)
 * - 业务逻辑和数据验证
 * - 字符串处理和格式化输出
 */

// 请在下方编写代码