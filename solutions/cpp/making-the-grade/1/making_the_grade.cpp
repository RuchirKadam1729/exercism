#include <array>
#include <string>
#include <vector>
#include <cmath>
// Round down all provided student scores.
std::vector<int> round_down_scores(std::vector<double> student_scores) {
    // TODO: Implement round_down_scores
    std::vector<int> ret;
    ret.reserve(student_scores.size());
    for(int x : student_scores) {
        ret.push_back(x);
    }
    return ret;
}

// Count the number of failing students out of the group provided.
int count_failed_students(std::vector<int> student_scores) {
    // TODO: Implement count_failed_students
    int count {};
    for(int score : student_scores){
        if (score <= 40) count++;
    }
    return count;
}

// Create a list of grade thresholds based on the provided highest grade.
std::array<int, 4> letter_grades(int highest_score) {
    // TODO: Implement letter_grades
    int step = (highest_score-40)/4;
    
    return {41,41+step,41+2*step,41+3*step};
}

// Organize the student's rank, name, and grade information in ascending order.
std::vector<std::string> student_ranking(
    std::vector<int> student_scores, std::vector<std::string> student_names) {
    // TODO: Implement student_ranking
    int n = student_scores.size();
    std::vector<std::string> ret;
    ret.reserve(n);
    for(int i = 0; i < n; i++) {
        ret.push_back(std::to_string(i+1)+". "+student_names[i]+": "+std::to_string(student_scores[i]));
    }
    
    return ret;
}

// Create a string that contains the name of the first student to make a perfect
// score on the exam.
std::string perfect_score(std::vector<int> student_scores,
                          std::vector<std::string> student_names) {
    // TODO: Implement perfect_score
    int n = student_scores.size();
    for(int i = 0; i < n; i++) {
        if (student_scores[i] == 100)
            return student_names[i];
    }
    return "";
}
