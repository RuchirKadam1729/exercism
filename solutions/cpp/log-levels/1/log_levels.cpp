#include <string>
#include <utility>

namespace log_line {

int colposf(std::string& line) {return line.find(":");}
void setifabsent(std::string& line, int& colpos) {if (colpos == -1) colpos = colposf(line);}
std::string message(std::string line, int colpos = -1) {
    // return the message
    setifabsent(line,colpos);
    return line.substr(colpos+2);
}

std::string log_level(std::string line, int colpos = -1) {
    // return the log level
    setifabsent(line,colpos);
    return line.substr(1,colpos-2);
}

std::string reformat(std::string line) {
    // return the reformatted message
    auto colpos = colposf(line);
    std::string msg = message(line,colpos), lvl = log_level(line,colpos);
    return msg + " (" + lvl +")";
}
}  // namespace log_line
