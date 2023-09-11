def flatten_list(input_list):
    result = []
    for item in input_list:
        if isinstance(item, list):
            result.extend(flatten_list(item))
        else:
            result.append(item)
    return result

# Örnek kullanım:
input_list = [[1, 'a', ['cat'], 2], [[[3]], 'dog'], 4, 5]
output_list = flatten_list(input_list)
print(output_list)

def reverse_list(input_list):
    input_list.reverse()
    for item in input_list:
        if isinstance(item, list):
            reverse_list(item)
    return input_list

# Örnek kullanım:
input_list = [[1, 2], [3, 4], [5, 6, 7]]
output_list = reverse_list(input_list)
print(output_list)
