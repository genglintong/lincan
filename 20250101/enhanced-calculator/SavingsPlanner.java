/**
 * 题目：智能储蓄规划器
 * 
 * 要求：
 * 1. 创建Calculator类，包含以下静态方法：
 *    - calculateYearsToTarget(double target, double yearly, double interest)
 *    - calculateCompoundInterest(double principal, double rate, int years)
 *    - calculateMonthlyPayment(double target, int months)
 *    - formatCurrency(double amount) : 格式化货币显示
 * 2. 在主程序中实现功能菜单：
 *    - 1. 计算达到目标需要多少年（考虑复利）
 *    - 2. 计算复利收益
 *    - 3. 计算月存款额度
 *    - 4. 比较不同利率的收益差异
 *    - 0. 退出程序
 * 3. 所有金额要格式化显示（保留2位小数，千位分隔符）
 * 4. 输入验证：金额必须为正数，利率范围0-50%
 * 
 * 进阶要求：
 * - 使用DecimalFormat格式化数字
 * - 实现图表式显示年度收益变化（用*表示）
 * - 支持通胀率计算（可选挑战）
 * 
 * 学习目标：
 * - 静态方法的设计和使用
 * - 数学计算和金融公式
 * - 数字格式化和用户体验
 * - 循环菜单和程序结构
 */

// 请在下方编写代码