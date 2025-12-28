/**
 * 题目：员工信息查询系统（重构版）
 * 
 * 要求：
 * 1. 创建Employee类，包含属性：
 *    - int id (员工编号)
 *    - String name (姓名)  
 *    - String department (部门)
 *    - double salary (工资)
 * 2. 创建员工数组，包含至少8个员工信息
 * 3. 实现查询方法：
 *    - findEmployeeById(Employee[] employees, int id)
 *    - findEmployeesByDepartment(Employee[] employees, String dept)
 *    - findHighSalaryEmployees(Employee[] employees, double minSalary)
 *    - calculateAverageSalary(Employee[] employees)
 * 4. 实现菜单系统，让用户选择查询类型
 * 5. 优雅地处理"未找到"的情况
 * 
 * 进阶要求：
 * - Employee类要有构造方法和toString()方法
 * - 使用ArrayList替代数组（可选挑战）
 * - 实现按工资排序功能
 * 
 * 学习目标：
 * - 类的设计和对象数组
 * - 方法重载和参数传递  
 * - 字符串比较和搜索算法
 * - 菜单驱动程序设计
 */

// 请在下方编写代码