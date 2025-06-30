def main():
    s = input().strip()
    # 각 자리 문자를 내림차순으로 정렬한 뒤 합쳐서 출력
    print(''.join(sorted(s, reverse=True)))

if __name__ == "__main__":
    main()