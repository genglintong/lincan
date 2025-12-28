#!/bin/bash

# Java项目运行脚本
# 使用方法: ./run_project.sh <date> <project-name> [sub-project]

# 项目根目录
PROJECT_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"

# 颜色定义
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# 显示使用帮助
show_help() {
    echo -e "${BLUE}Java小项目运行脚本${NC}"
    echo
    echo "使用方法: $0 <date> <project-name> [sub-project]"
    echo
    echo "可用日期目录:"
    for date_dir in "$PROJECT_ROOT"/[0-9]*; do
        if [ -d "$date_dir" ]; then
            echo "  $(basename "$date_dir")"
        fi
    done
    echo
    echo "可用项目:"
    echo "  conditional-logic    - 条件判断逻辑 (Text1.java)"
    echo "  name-lookup         - 名单查询系统 (Text2.java)"
    echo "  score-analyzer      - 成绩分析器 (Text3.java)"
    echo "  score-sorter        - 成绩排序器 (Text6.java)"
    echo "  savings-calculator  - 储蓄计算器 (Text4.java)"
    echo "  bank-account        - 银行账户管理 (Account.java, Text5.java)"
    echo
    echo "示例:"
    echo "  $0 20251228 conditional-logic"
    echo "  $0 20251228 score-analyzer"
    echo "  $0 20251228 bank-account"
}

# 编译并运行Java程序
compile_and_run() {
    local date_dir=$1
    local project_dir=$2
    local java_file=$3
    local main_class=$4
    
    local full_path="$PROJECT_ROOT/$date_dir/$project_dir"
    
    echo -e "${YELLOW}编译项目: $date_dir/$project_dir/$java_file${NC}"
    
    # 进入项目目录
    cd "$full_path" || {
        echo -e "${RED}错误: 找不到项目目录 $full_path${NC}"
        exit 1
    }
    
    # 编译Java文件
    if javac "$java_file" 2>/dev/null; then
        echo -e "${GREEN}编译成功${NC}"
        echo -e "${BLUE}运行程序...${NC}"
        echo "----------------------------------------"
        
        # 运行程序
        java "$main_class"
        
        echo "----------------------------------------"
        echo -e "${GREEN}程序运行完成${NC}"
        
        # 清理class文件
        rm -f *.class
        echo -e "${YELLOW}已清理编译文件${NC}"
    else
        echo -e "${RED}编译失败${NC}"
        exit 1
    fi
}

# 银行账户特殊处理 - 需要同时编译Account.java和Text5.java
compile_and_run_bank_account() {
    local date_dir=$1
    local project_dir=$2
    
    local full_path="$PROJECT_ROOT/$date_dir/$project_dir"
    
    echo -e "${YELLOW}编译银行账户项目: $date_dir/$project_dir${NC}"
    
    # 进入项目目录
    cd "$full_path" || {
        echo -e "${RED}错误: 找不到项目目录 $full_path${NC}"
        exit 1
    }
    
    # 同时编译Account.java和Text5.java
    if javac Account.java Text5.java 2>/dev/null; then
        echo -e "${GREEN}编译成功${NC}"
        echo -e "${BLUE}运行程序...${NC}"
        echo "----------------------------------------"
        
        # 运行Text5.java
        java "Text5"
        
        echo "----------------------------------------"
        echo -e "${GREEN}程序运行完成${NC}"
        
        # 清理class文件
        rm -f *.class
        echo -e "${YELLOW}已清理编译文件${NC}"
    else
        echo -e "${RED}编译失败${NC}"
        exit 1
    fi
}

# 主逻辑
main() {
    if [ $# -eq 0 ] || [ "$1" = "-h" ] || [ "$1" = "--help" ]; then
        show_help
        exit 0
    fi
    
    local date=$1
    local project=$2
    local sub_project=$3
    
    # 检查日期目录是否存在
    if [ ! -d "$PROJECT_ROOT/$date" ]; then
        echo -e "${RED}错误: 找不到日期目录 '$date'${NC}"
        show_help
        exit 1
    fi
    
    case $project in
        "conditional-logic")
            compile_and_run "$date" "conditional-logic" "Text1.java" "Text1"
            ;;
        "name-lookup")
            compile_and_run "$date" "name-lookup" "Text2.java" "Text2"
            ;;
        "score-analyzer")
            compile_and_run "$date" "score-analyzer" "Text3.java" "Text3"
            ;;
        "score-sorter")
            compile_and_run "$date" "score-sorter" "Text6.java" "Text6"
            ;;
        "savings-calculator")
            compile_and_run "$date" "savings-calculator" "Text4.java" "Text4"
            ;;
        "bank-account")
            compile_and_run_bank_account "$date" "bank-account"
            ;;
        # 20250101新增项目
        "input-validation")
            compile_and_run "$date" "input-validation" "AgeClassifier.java" "AgeClassifier"
            ;;
        "array-optimization")
            compile_and_run "$date" "array-optimization" "ScoreManager.java" "ScoreManager"
            ;;
        "method-extraction")
            compile_and_run "$date" "method-extraction" "EmployeeManager.java" "EmployeeManager"
            ;;
        "enhanced-calculator")
            compile_and_run "$date" "enhanced-calculator" "SavingsPlanner.java" "SavingsPlanner"
            ;;
        "advanced-banking")
            compile_and_run "$date" "advanced-banking" "BankSystem.java" "BankSystem"
            ;;
        *)
            echo -e "${RED}错误: 未知项目 '$project'${NC}"
            show_help
            exit 1
            ;;
    esac
}

# 执行主函数
main "$@"